package algorithms.medium;

import java.util.List;
import java.util.Stack;

public class KeysAndRooms {

    public static void main(String[] args) {
        assert canVisitAllRooms(List.of(List.of(1), List.of(2), List.of(3), List.of()));         // [[1],[2],[3],[]] true
        assert !canVisitAllRooms(List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0)));  // [[1,3],[3,0,1],[2],[0]] false
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visitedRooms = new boolean[rooms.size()];
        visitedRooms[0] = true;

        recursiveVisit(0, rooms, visitedRooms);

        for (boolean open : visitedRooms) {
            if (!open) {
                return false;
            }
        }
        return true;
    }

    private static void recursiveVisit(int currentRoom, List<List<Integer>> rooms, boolean[] visitedRooms) {
        for (Integer currentRoomKey : rooms.get(currentRoom)) {
            if (!visitedRooms[currentRoomKey]) {
                visitedRooms[currentRoomKey] = true;
                recursiveVisit(currentRoomKey, rooms, visitedRooms);
            }
        }
    }

    public static boolean canVisitAllRooms1(List<List<Integer>> rooms) {
        int[] visitedRooms = new int[rooms.size()];
        visitedRooms[0] = 1;

        Stack<Integer> stack = new Stack<>();
        rooms.getFirst().forEach(stack::push);

        while (!stack.isEmpty()) {
            Integer currentRoom = stack.pop();
            if (visitedRooms[currentRoom] == 0) {
                visitedRooms[currentRoom] = 1;
                rooms.get(currentRoom).forEach(stack::push);
            }
        }

        for (Integer visited : visitedRooms) {
            if (visited != 1) {
                return false;
            }
        }
        return true;
    }
}
